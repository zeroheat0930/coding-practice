const getTime = (time) => {
    const [min, sec] = time.split(':').map(Number);
    return min * 60 + sec;
}

const getTimeToString = (seconds) => {
    const min = Math.floor(seconds / 60).toString().padStart(2, '0');
    const sec = (seconds % 60).toString().padStart(2, '0');
    return `${min}:${sec}`;
}

function solution(video_len, pos, op_start, op_end, commands) {
    let curr = getTime(pos);
    const opStartTime = getTime(op_start);
    const opEndTime = getTime(op_end);
    const videoEndTime = getTime(video_len);

    // 초기 오프닝 스킵
    if (curr >= opStartTime && curr <= opEndTime) {
        curr = opEndTime;
    }

    commands.forEach((cmd) => {
        if (cmd === 'prev') {
            curr = Math.max(0, curr - 10);
        } else {
            curr = Math.min(videoEndTime, curr + 10);
        }

        if (curr >= opStartTime && curr <= opEndTime) {
            curr = opEndTime;
        }
    });

    return getTimeToString(curr);
}
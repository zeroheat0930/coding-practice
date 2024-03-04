function solution(array) {
    var answer = 0;
    var len = array.length;
    var middleIndex = Math.floor(len / 2); // 중간 인덱스 계산

    // 배열을 크기대로 정렬
    array.sort(function(a, b) {
        return a - b;
    });

    // 배열의 중간 값을 반환
    if (len % 2 === 1) { // 홀수 길이인 경우
        answer = array[middleIndex];
    } else { // 짝수 길이인 경우
        // 중간 두 값의 평균 반환
        answer = (array[middleIndex - 1] + array[middleIndex]) / 2;
    }

    return answer;
}
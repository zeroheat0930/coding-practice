function solution(numer1, denom1, numer2, denom2) {
    // 분수1과 분수2의 합을 구하기 위해 분자와 분모를 각각 더합니다.
    const numerSum = numer1 * denom2 + numer2 * denom1;
    const denomSum = denom1 * denom2;

    // 합을 기약 분수로 나타내기 위해 최대공약수를 구합니다.
    const gcd = getGCD(numerSum, denomSum);

    // 분자와 분모를 최대공약수로 나누어 기약 분수를 얻습니다.
    const numer = numerSum / gcd;
    const denom = denomSum / gcd;

    // 분자와 분모를 순서대로 배열에 담아 반환합니다.
    return [numer, denom];
}

// 최대공약수(Greatest Common Divisor, GCD)를 구하는 함수
function getGCD(a, b) {
    if (b === 0) {
        return a;
    }
    return getGCD(b, a % b);
}
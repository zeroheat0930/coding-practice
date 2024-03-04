import java.util.Arrays;

class Solution {
    public double solution(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            // 배열의 길이가 짝수인 경우 중앙의 두 수의 평균을 반환합니다.
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            // 배열의 길이가 홀수인 경우 중앙의 수를 반환합니다.
            return array[length / 2];
        }
    }
}
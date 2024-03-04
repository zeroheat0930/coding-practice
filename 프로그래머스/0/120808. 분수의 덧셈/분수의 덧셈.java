class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denum = denom1 * numer2 + denom2 * numer1;
        int num = denom1 * denom2;
        int gcd = fnGCD(denum, num);

        return new int[]{denum/gcd, num/gcd};
    }

    int fnGCD(int a, int b){
        return (b != 0)? fnGCD(b, a%b) : a;
    }
}
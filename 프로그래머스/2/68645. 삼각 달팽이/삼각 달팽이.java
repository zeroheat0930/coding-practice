// dx, dy로 방향 정해서 푸는 방법
// 3방향이기 때문에 아래,오른쪽,왼쪽위 순서대로
// dx는 0, 1, -1
// dy는 1, 0, -1
class Solution {
    // 변하면 안되기 때문에 static final 붙여서 클래스 선언
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    
    public int[] solution(int n) {
        // 1. [n x n] 2차원 배열 선언
        int[][] triangle = new int[n][n];
        int v = 1;
        
        // 2. 숫자를 채운 현재 위치를 (0,0)으로 설정
        int x = 0;
        int y = 0;
        
        // 3. 방향 변수 추가
        int d = 0;
        
        // 4. 방향에 따라 이동할 수 없을 떄까지 반복하면서 숫자 채우기
        while (true){
            // 숫자 채우기
            triangle[y][x] = v++;
            
            // 진행 방향 이동
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            // 조건에 걸리면 현재 진행방향으로 더이상 진행못함
            if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0){
                // 방향이 3개기 때문에 %3으로 방향을 판단
                d = (d+1) % 3;
                
                nx = x + dx[d];
                ny = y + dy[d];
                
                // 근데 모든 숫자가 다 채워지면 진행을 못할수 잇기에 break로 빠져나옴.
                if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) break;
            }
            
            // if문 종료후 현재 위치 업데이트;
            x = nx;
            y = ny;
        }
        
        // 5. 채워진 숫자를 차례대로 1차원 배열에 옮겨서 변환
        int[] result = new int[v-1];
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }
}




// 정석으로 푼 코드
// class Solution {
//     public int[] solution(int n) {
//         // 1. [n x n] 2차원 배열 선언
//         int[][] triangle = new int[n][n];
//         int v = 1;
//         // 2. 숫자를 채운 현재 위치를 (0,0)으로 설정
//         int x = 0;
//         int y = 0;
//         // 3. 방향에 따라 이동할 수 없을 떄까지 반복하면서 숫자 채우기
//         while (true){
//             // 3-A. 아래로 이동
//             while (true){
//                 triangle[y][x] = v++;
//                 if (y + 1 == n || triangle[y+1][x] != 0) break;
//                 y += 1;
//             }
//             if (x + 1 == n || triangle[y][x+1] != 0) break;
//             x += 1;
//             // 3-B. 오른쪽으로 이동
//             while (true){
//                 triangle[y][x] = v++;
//                 if (x + 1 == n || triangle[y][x+1] != 0) break;
//                 x += 1;
//             }
//             if (triangle[y-1][x-1] != 0) break;
//             x -= 1;
//             y -= 1;
//             // 3-C. 왼쪽 위로 이동
//             while (true){
//                 triangle[y][x] = v++;
//                 if (triangle[y-1][x-1] != 0) break;
//                 x -= 1;
//                 y -= 1;
//             }
//             if (y + 1 == n || triangle[y+1][x] != 0) break;
//             y += 1;
//         }
//         // 4. 채워진 숫자를 차례대로 1차원 배열에 옮겨서 변환
//         int[] result = new int[v-1];
//         int index = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j <= i; j++){
//                 result[index++] = triangle[i][j];
//             }
//         }
//         return result;
//     }
// }
def solution(ineq, eq, n, m):
    if (ineq == "<" and eq == "=" and n <= m) or (ineq == ">" and eq == "=" and n >= m) or (ineq == "<" and eq == "!" and n < m) or (ineq == ">" and eq == "!" and n > m):
        return 1
    else:
        return 0
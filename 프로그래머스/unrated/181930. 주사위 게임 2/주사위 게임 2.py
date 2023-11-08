def solution(a, b, c):
    unique_count = len(set([a, b, c]))  # 세 주사위의 중복되지 않은 숫자의 개수

    if unique_count == 1:  # 세 숫자가 모두 같은 경우
        return (a + b + c) * (a**2 + b**2 + c**2) * (a**3 + b**3 + c**3)
    elif unique_count == 2:  # 두 숫자는 같고 나머지 다른 숫자가 있는 경우
        return (a + b + c) * (a**2 + b**2 + c**2)
    else:  # 세 숫자가 모두 다른 경우
        return a + b + c
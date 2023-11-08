def solution(n, control):
    answer = 0
    b = n
    for num in control:
        if num == "w":
            b = b+1
        elif num == "s":
            b = b-1
        elif num == "d":
            b = b+10
        elif num == "a":
            b = b-10
    return b
def solution(a, b):
    answer = 0
    if int(str(a) + str(b)) > 2*int(a)*int(b):
        answer = int(str(a) + str(b))
    else:
        answer = 2*int(a)*int(b)
    return answer
def solution(num_list):
    answer = 0
    a = ""
    b = ""
    for num in num_list:
        if num%2 == 0:
            a += str(num)
        else:
            b += str(num)
    return int(a) + int(b)
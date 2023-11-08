def solution(num_list):
    if len(num_list) < 2:  # 리스트의 길이가 1 이하인 경우
        return num_list

    last_num = num_list[-1]  # 마지막 원소
    prev_num = num_list[-2]  # 그 전 원소

    if last_num > prev_num:  # 마지막 원소가 그 전 원소보다 큰 경우
        num_list.append(last_num - prev_num)
    else:  # 마지막 원소가 그 전 원소보다 크지 않은 경우
        num_list.append(last_num * 2)

    return num_list
def solution(my_string):
    answer = ''
    for i in my_string:
        if i in ['a', 'e', 'i', 'o', 'u']:
            continue
        else:
            answer += i
    return answer
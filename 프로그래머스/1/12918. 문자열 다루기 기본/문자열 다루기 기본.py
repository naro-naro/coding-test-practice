def solution(s):
    if (len(s) == 4) | (len(s) == 6):
        answer = s.isdigit()
    else:
        answer = False
    return answer
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// strstr로 문자열 검색.

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* my_string, const char* target) {
    int answer = 0;
    char* ptr = strstr(my_string,target);
    if(ptr != NULL){
        answer = 1;
    }
    return answer;
}
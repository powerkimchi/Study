#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
// delete_list_len은 배열 delete_list의 길이입니다.
int* solution(int arr[], size_t arr_len, int delete_list[], size_t delete_list_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int l = arr_len;
    int k = delete_list_len;
    int idx = 0;
    int s = 0;
    int* answer = (int*)malloc((l+1)*sizeof(int));
    for(int i = 0; i < l; i++){
        s = 0;
        for(int j = 0; j < delete_list_len; j++){
            if(arr[i] != delete_list[j]){
                s++;
            }
        }
        if(s == k){
            answer[idx++] = arr[i];
        }
    }
    return answer;
}
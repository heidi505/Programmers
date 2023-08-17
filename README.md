# 프로그래머스 하면서 써본 함수 정리

## 1. 문자열을 정수로
- Interger.valueOf()
- Integer.parseInt()
- 인수는 문자열

### 1-1. 정수를 문자열로
- String.valueOf()
- Integer.toString()

## 2. ~로 시작하는지 확인
- (문자열이름).startsWith("접두사")
- boolean 타입, "접두사"로 시작하면 1, 시작하지 않으면 0으로 반환한다.

## 3. 대문자로/소문자로 변환
- (문자열이름).toLowerCase()
- (문자열이름).toUpperCase()

## 4. 배열에 값 넣기
-  System.arraycopy(originArray, x, array, y, z)
-  originArray의 x번째 원소부터 z개를 array의 y번째부터 넣겠다
- ex) System.arraycopy(arr1, 0, arr2, 1, 3);    // arr1의 index 0에서부터 3개를, arr2의 index 1에서부터 copy
 정리할 것: charAt(i)랑 String.valueOf()랑 Character.getNumericValue()

# AppEightGoodWords
## ListView
- 리스트 형태의 데이터를 세로 방향으로 나열하여 화면에 표시하는 뷰 그룹의 한 종류<br/>

구현 순서
1. 레이아웃에 ListView 추가하기 [activity_sentence.xml](https://github.com/okrecords/AppEightGoodWords/blob/master/app/src/main/res/layout/activity_sentence.xml)
2. 데이터 생성 [데이터](https://github.com/okrecords/AppEightGoodWords/blob/3909d0578424babfd8cb823c8200514f9eaece68/app/src/main/java/com/okre/appeightgoodwords/SentenceActivity.kt#L13)
3. ListView에 들어가는 View [listview_item.xml](https://github.com/okrecords/AppEightGoodWords/blob/master/app/src/main/res/layout/listview_item.xml)
4. View를 생성하고 관리하는 어댑터 클래스 생성 [ListViewAdapter.kt](https://github.com/okrecords/AppEightGoodWords/blob/master/app/src/main/java/com/okre/appeightgoodwords/ListViewAdapter.kt)
5. 어댑터 연결 [SentenceActivity.kt](https://github.com/okrecords/AppEightGoodWords/blob/3909d0578424babfd8cb823c8200514f9eaece68/app/src/main/java/com/okre/appeightgoodwords/SentenceActivity.kt#L23)
<br/><br/><br/>

## onBackPressed
- 뒤로 가기 버튼 눌렀을 때 호출되는 메서드

AppEightGoodWords에서 [onBackPressed](https://github.com/okrecords/AppEightGoodWords/blob/3909d0578424babfd8cb823c8200514f9eaece68/app/src/main/java/com/okre/appeightgoodwords/MainActivity.kt#L39)
<br/><br/><br/>

## fontFamily
- 글꼴 변경
- font 파일 위치 : res > font 폴더 생성 -> 해당 폴더에 폰트 추가
```
android:fontFamily="@font/font 이름 반드시 소문자로 구성해야 인식"
```
AppEightGoodWords에서 [fontFamily](https://github.com/okrecords/AppEightGoodWords/blob/3909d0578424babfd8cb823c8200514f9eaece68/app/src/main/res/layout/activity_main.xml#L17)

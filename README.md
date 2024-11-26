# 2024.11.24_StyleSnap_Spring
StyleSnap 프로젝트, 스프링에 옮겨서 DB 연결하기


11/24 
1. (Template) 기존 stylesnap (html,css,js) 파일, Spring 프로젝트에 적용하기
2. (DTO) StyleDTO, TopDTO, BottomDTO 생성
3. (DB) stylesnap 스키마에 style, top, bottom 테이블 추가

   
11/25  
1. (Controller) MainController, MakeStyleController 생성
2. MakeStyleController에 rest 적용하기 (get, post) -
 +++ input했는 img 하나, post해서 id, url console 출력하는 것까지 했음

11/26
1. 사용자가 업로드한 이미지를 db에 넣고, 로컬 폴더에 넣고
2. 불러올 때는 로컬 폴더에 있는 사진을 db를 통해서 불러오려고 했는데 그게 잘 안됨

   일단 저 순서가 틀린 거 같기도 하고,
   1. 사진 업로드할 때 정보가 db에 들어가도록
   2. 사진 업로드할 때 폴더에 다운로드 되도록
   이런식으로 분리해서 한 번 해봐야겠음

-> 사진 업로드를 서버에 저장하는 걸로하자. 그리고 그 url를 db에 저장하도록

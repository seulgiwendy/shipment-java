### 선박 운행 문제

**조건**

운수회사는 20개의 선박을 가지고 있다. 그리고 정박시설이 1개 있는데 여기서 화물을 10분에 50개씩 실을 수 있다. 

* 선박당 최대 실을 수 있는 화물은 500개다. 
* 선박당 주어진 최대 배송시간은 200시간이다. 
* 정비시설에서 선박에 화물을 실을때 해당 선박의 선적이 끝날 때까지 다른 선박은 기다려야 한다.
* 선박이 배송할때 모항에서 최초의 배송지까지는 2시간이 걸린다.
* 배송지마다의 이동시간은 1시간이고 배송지를 지날때마다 1시간이 더해진다.
    * (예를 들어 a에서 b가 1시간 걸리면 b에서 c는 2시간...) 
* 배송이 완료되고 모항까지 이동시간은 3시간이다. 
* 선박이 모항에 도착하면 반드시 정비시간 10시간을 거쳐야 한다. 
    * 다음번부터 최대 실을 수 있는 화물의 개수가 50개씩 증가하고 최대 배송시간은 30시간씩 증가한다.
* 배송지에서는 화물을 10개씩 내린다.

**풀이** 

6개월동안 선박을 통해 배송할때 배송하는 화물의 수를 텍스트 파일로 출력하라

(예시. 1척 : 3000개, 2척 : 8000개...)

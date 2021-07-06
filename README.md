# Spring Potato
## Introduction
>느 집엔 이거 없지? 너 봄 감자가 맛있단다.

## 미니게임 방법
### 슬롯 설명
제안을 들고 공중에 우클릭을 하면, 3*3 인벤토리가 열립니다.
인벤토리의 위쪽 가운데 슬롯을 **제안 슬롯**,
아래쪽 가운데 슬롯을 **난이도 슬롯**이라 합니다.
난이도 슬롯에는 콘크리트가 있는데, 한 번 클릭하면 다음과 같이 변합니다.

* 쉬움 : 1분 / 2점
* 보통 : 3분 / 5점
* 어려움 : 5분 / **10점**

쉬움을 클릭하면 보통으로, 보통을 클릭하면 어려움으로,
어려움을 클릭하면 쉬움으로 변합니다.

다른 사람이 제안 인벤토리를 열고 있으면, 인벤토리를 열 수 없습니다.

### 제안하기
제안 슬롯에 1개의 아이템을 올리고, 난이도를 클릭해서 설정합니다.
설정이 끝났다면, ESC로 인벤토리를 닫습니다.
그 순간 모든 사람에게 화면으로 제안이 공표됩니다.

제안은 1분 이내에 끝내야 합니다. 그렇지 못하면, 자동 취소됩니다.

제안 인벤토리를 열면 앞으로 6분간 제안 인벤토리를 열 수 없습니다.

### 제안 확인하기
제안 목록 아이템을 우클릭하면, 지금 등록되어있는 모든 제안이
적힌 책을 열람할 수 있습니다.

### 점수 계산
제안의 난이도에 따라 플레이어들에게 주어지는 시간이 다릅니다.

* 쉬움 : 1분
* 보통 : 3분
* 어려움 : 5분

난이도는 **제안하는 사람의 입장에서의 난이도**를 의미합니다.
즉, 제안자를 제외한 사람들에게는 쉬움이 가장 달성하기 어렵습니다.

주어진 시간이 끝나면 점수 계산이 시작됩니다.

* **제안자를 제외한 플레이어**는 시간 안에 아이템을 획득하면
**1점**을 획득합니다.
* **제안자**는 시간 안에 아이템을 획득한 사람이 **없으면**
**난이도에 따라** 점수를 획득합니다.
> * 쉬움 : 1분 / 2점
> * 보통 : 3분 / 5점
> * 어려움 : 5분 / **10점**

* 만약 획득한 사람이 있으면 (사람 수) × (난이도 점수)만큼 점수가
**차감**됩니다.

### 아이템 제출
제안 아이템을 획득하였다면, 해당 아이템을 들고 우클릭하여 제출할
수 있습니다.


## Environment
* Kotlin
* Tap
* Kommand

# ServiceCenter
ServiceCenter Wrapper

기본 ServiceCenter 인터페이스를 이용해서 Activity, Toast, SQLite, 그래픽, 위치서비스 등등 새로운 서비스들을 만들 수 있습니다.

#2016.05.12

기본 구조에 대한 설명

ServiceCenter에 ResRequest 를 요청하면 서비스에서 알아서 다 처리를 하고 ResResponse 를 돌려 줍니다. 

아직 RequestBody 를 JSONObject 그대로 할지, RequestHeader 처럼 감쌀지 정하지 못했습니다. 좋은 의견있으면 알려주세요. 

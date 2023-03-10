package org.sunbird.dp.fixture

object EventFixture {

  val EVENT = """{"_id":"63bfa8f173f6368ebde21bbe","deleted":false,"programId":"5f362b78af0a4decfa9a106f","programName":"mno","programExternalId":"$programExternalId","requestForPIIConsent":true,"userRoleInformation":{"role":"HM,DEO","state":"db331a8c-b9e2-45f8-b3c0-7ec1e826b6df","district":"1dcbc362-ec4c-4559-9081-e0c2864c2931","school":"c5726207-4f9f-4f45-91f1-3e9e8e84d824"},"userId":"ba9aa220-ff1b-4717-b6ea-ace55f04f11","appInformation":{"appName":"Diksha","appVersion":"5.2"},"userProfile":{"userLocations":[{"code":"2822","name":"ANANTAPUR","id":"2f76dcf5-e43b-4f71-a3f2-c8f19e1fce03","type":"district","parentId":"bc75cc99-9205-463e-a722-5326857838f8"},{"code":"282262","name":"AGALI","id":"966c3be4-c125-467d-aaff-1eb1cd525923","type":"block","parentId":"2f76dcf5-e43b-4f71-a3f2-c8f19e1fce03"},{"code":"28","name":"Andhra Pradesh","id":"bc75cc99-9205-463e-a722-5326857838f8","type":"state","parentId":null},{"code":"2822620004","name":"ZPHS AGALI","id":"beb0bcf4-d7cd-4a72-8f35-be8e5b03c0d1","type":"cluster","parentId":"966c3be4-c125-467d-aaff-1eb1cd525923"},{"code":"28226200816","name":"SMT PRAMEELAMMA AND SRI KGA GUPTA EM UP SCHOOL","id":"01337588247832985613211","type":"school","parentId":"g"}],"profileUserTypes":[{"subType":"deo","type":"administrator"}],"organisations":[{"organisationId":"0126796199493140480","orgName":"Pre-prod Custodian Organization","isSchool":false},{"organisationId":"01337588247832985613211","orgName":"SMT PRAMEELAMMA AND SRI KGA GUPTA EM UP SCHOOL","isSchool":true}],"framework":{"board":["CBSE"]}},"noOfResourcesStarted":3,"updatedAt":"2023-01-12T06:30:56.829Z","createdAt":"2022-01-12T06:30:09.476Z","__v":0}"""

  val WHEN_VALUES_ARE_EMPTY = """{"_id":"63bfa8f173f6368ebde21bbe","deleted":false,"requestForPIIConsent":true,"userRoleInformation":{"role":"HM,DEO","state":"db331a8c-b9e2-45f8-b3c0-7ec1e826b6df","district":"1dcbc362-ec4c-4559-9081-e0c2864c2931","school":"c5726207-4f9f-4f45-91f1-3e9e8e84d824"},"userId":"98765","appInformation":{"appName":"Diksha","appVersion":"5.2"},"userProfile":{"userLocations":[{"code":"","name":"","id":"","type":"district","parentId":"bc75cc99-9205-463e-a722-5326857838f8"},{"code":"","name":"","id":"","type":"block","parentId":"2f76dcf5-e43b-4f71-a3f2-c8f19e1fce03"},{"code":"","name":"","id":"","type":"state","parentId":null},{"code":"","name":"","id":"","type":"cluster","parentId":"966c3be4-c125-467d-aaff-1eb1cd525923"},{"code":"","name":"","id":"","type":"school","parentId":"g"}],"profileUserTypes":[{"subType":"","type":""}],"organisations":[{"organisationId":"","orgName":"","isSchool":false},{"organisationId":"01337588247832985613211","orgName":"SMT PRAMEELAMMA AND SRI KGA GUPTA EM UP SCHOOL","isSchool":true}],"framework":{"board":["CBSE"]}},"noOfResourcesStarted":3,"updatedAt":"2023-01-12T06:30:56.829Z","createdAt":"2022-01-12T06:30:09.476Z","__v":0}"""

  val WHEN_VALUES_ARE_NULL = """{"_id":"63bfa8f173f6368ebde21bbe","deleted":false,"programId":"67890","programName":null,"programExternalId":null,"requestForPIIConsent":true,"userRoleInformation":{"role":"HM,DEO","state":"db331a8c-b9e2-45f8-b3c0-7ec1e826b6df","district":"1dcbc362-ec4c-4559-9081-e0c2864c2931","school":"c5726207-4f9f-4f45-91f1-3e9e8e84d824"},"userId":"54321","appInformation":{"appName":"Diksha","appVersion":"5.2"},"userProfile":{"userLocations":[{"code":"","name":"","id":"","type":"district","parentId":"bc75cc99-9205-463e-a722-5326857838f8"},{"code":null,"name":null,"id":null,"type":"block","parentId":"2f76dcf5-e43b-4f71-a3f2-c8f19e1fce03"},{"code":null,"name":null,"id":null,"type":"state","parentId":null},{"code":null,"name":null,"id":null,"type":"cluster","parentId":"966c3be4-c125-467d-aaff-1eb1cd525923"},{"code":null,"name":null,"id":null,"type":"school","parentId":"g"}],"profileUserTypes":[{"subType":null,"type":null}],"organisations":[{"organisationId":null,"orgName":null,"isSchool":false},{"organisationId":"01337588247832985613211","orgName":"SMT PRAMEELAMMA AND SRI KGA GUPTA EM UP SCHOOL","isSchool":true}],"framework":{"board":["CBSE"]}},"noOfResourcesStarted":3,"updatedAt":"2040-01-12T06:30:56.829Z","createdAt":"2050-01-12T06:30:09.476Z","__v":0}"""

}
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/DictionaryFeature.feature");
formatter.feature({
  "line": 1,
  "name": "DictionaryStepDefination",
  "description": "",
  "id": "dictionarystepdefination",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5237100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to find word related information",
  "description": "",
  "id": "dictionarystepdefination;user-is-able-to-find-word-related-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user has already word information",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user press button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user is able to view word related type",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the user is able to view word related meaning/usage",
  "keyword": "And "
});
formatter.match({
  "location": "DictionaryStepDefination.theUserAddWord()"
});
formatter.result({
  "duration": 5354710600,
  "status": "passed"
});
formatter.match({
  "location": "DictionaryStepDefination.theUserPressButton()"
});
formatter.result({
  "duration": 44618300,
  "status": "passed"
});
formatter.match({
  "location": "DictionaryStepDefination.theUserIsAbleToViewordRelatedInformation()"
});
formatter.result({
  "duration": 103500,
  "status": "passed"
});
formatter.match({
  "location": "DictionaryStepDefination.theUserIsAbleToViewordRelatedInformation()"
});
formatter.result({
  "duration": 35400,
  "status": "passed"
});
});
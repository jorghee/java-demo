// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
/*
export const environment = {
  production: false,
  BACKEND_URL: window.location.protocol + '//' + window.location.hostname + ':' + 8080,
  DOCUMENTS_URL: 'http://springdemo.io:80',
  WS_BACKEND_URL: 'ws://' + window.location.hostname + ':' + 8080,
  DOCUMENT_VALUES: {'BACKEND_URL': window.location.protocol + '//' + window.location.hostname + ':' + 8080},
  GIT_DOCUMENTS_URL: 'https://github.com/marco76/java-demo/tree/master/server/src/main/resources/pages/'
};
*/
export const environment = {
  production: true,
 // BACKEND_URL : 'http://35.185.57.168:8080',
  BACKEND_URL: 'http://javaee-server.scapp.io',
  WS_BACKEND_URL : 'ws://javaee-server.scapp.io',
  DOCUMENT_VALUES: {'BACKEND_URL': 'http://javaee-server.scapp.io'},
  GIT_DOCUMENTS_URL: 'expected \'styles\' to be an array of strings.\t',
  DOCUMENTS_URL: 'http://spring-conferences.scapp.io',
  SPRNG_DATA: 'http://spring-conferences.scapp.io',
  CLOUD_DOCS: 'https://storage.cloud.google.com/javademo-166015.appspot.com/docs/'
};

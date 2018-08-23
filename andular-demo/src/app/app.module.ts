
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http'

import {
  SocialLoginModule,
  AuthServiceConfig,
  GoogleLoginProvider,
} from "angular5-social-login";
import { AppComponent } from './app.component';


// Configs 
export function getAuthServiceConfigs() {
let config = new AuthServiceConfig(
    [
      {
        id: GoogleLoginProvider.PROVIDER_ID,
        provider: new GoogleLoginProvider("361913955768-h08iheqognma71rub15ltj7tf7htjnaa.apps.googleusercontent.com")
      },
    ]
);
return config;
}

@NgModule({
  declarations: [
    AppComponent,
  ],
imports: [

  SocialLoginModule,
  BrowserModule,
  HttpModule

],
providers: [

  {
    provide: AuthServiceConfig,
    useFactory: getAuthServiceConfigs
  }
],
bootstrap: [AppComponent]
})

export class AppModule { }



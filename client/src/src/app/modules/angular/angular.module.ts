import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AvTableComponent } from "../../av-components/AvTable/av-table/av-table.component";
import { MaterialModule } from "../material.module";

@NgModule({
  imports: [
    CommonModule,
    MaterialModule
  ],
  declarations: [
    AvTableComponent
  ],
  exports: [
    AvTableComponent
  ]
})
export class AngularModule {
}

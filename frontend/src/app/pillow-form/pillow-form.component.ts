import { Component, OnInit } from '@angular/core';
import { PillowFight } from '../pillow-fight';

@Component({
  selector: 'app-pillow-form',
  templateUrl: './pillow-form.component.html',
  styleUrls: ['./pillow-form.component.css']
})
export class PillowFormComponent {

  model = new PillowFight('chun', 'zheng', 'location', 'Hello World!');

  submitted = false;
  onSubmit() { this.submitted = true; }

  get diagnostic() { return JSON.stringify(this.model); }

}

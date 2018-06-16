import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PillowFormComponent } from './pillow-form.component';

describe('PillowFormComponent', () => {
  let component: PillowFormComponent;
  let fixture: ComponentFixture<PillowFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PillowFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PillowFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

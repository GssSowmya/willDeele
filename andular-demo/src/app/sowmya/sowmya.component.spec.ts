import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SowmyaComponent } from './sowmya.component';

describe('SowmyaComponent', () => {
  let component: SowmyaComponent;
  let fixture: ComponentFixture<SowmyaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SowmyaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SowmyaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

package com.yxcorp.gifshow.hotspot.presenter.EventListPresenter$2;
import androidx.recyclerview.widget.LinearLayoutManager;
import gwa.e;
import android.content.Context;

public class EventListPresenter$2 extends LinearLayoutManager	// class@0018e3
{
    public final e r;

    public void EventListPresenter$2(e p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollVertically(){
       return false;
    }
}

package com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import android.content.Context;

public class LiveGzoneTurntableTaskPresenter$1 extends LinearLayoutManager	// class@000e4e
{
    public final LiveGzoneTurntableTaskPresenter r;

    public void LiveGzoneTurntableTaskPresenter$1(LiveGzoneTurntableTaskPresenter p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean isAutoMeasureEnabled(){
       return true;
    }
}

package com.yxcorp.gifshow.magic.ui.magicemoji.similar.SimilarPresenter$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.e;
import android.content.Context;

public class SimilarPresenter$1 extends LinearLayoutManager	// class@001c10
{
    public final e r;

    public void SimilarPresenter$1(e p0,Context p1,int p2,boolean p3){
       this.r = p0;
       super(p1, p2, p3);
    }
    public boolean canScrollVertically(){
       return false;
    }
}

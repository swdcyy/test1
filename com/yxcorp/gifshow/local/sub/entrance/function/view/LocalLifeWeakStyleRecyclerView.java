package com.yxcorp.gifshow.local.sub.entrance.function.view.LocalLifeWeakStyleRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;

public final class LocalLifeWeakStyleRecyclerView extends CustomRecyclerView	// class@001aaa
{
    public boolean q;

    public void LocalLifeWeakStyleRecyclerView(Context p0){
       super(p0);
    }
    public void LocalLifeWeakStyleRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LocalLifeWeakStyleRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean canScrollHorizontally(int p0){
       return this.q;
    }
}

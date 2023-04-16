package com.yxcorp.gifshow.growth.interest.InterestLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.IndexOutOfBoundsException;

public final class InterestLayoutManager extends FlexboxLayoutManager	// class@0013bb
{

    public void InterestLayoutManager(Context p0,int p1){
       super(p0, p1);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InterestLayoutManager.class, "1")) {
          return;
       }
       a.p(p0, "recycler");
       try{
          a.p(p1, "state");
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e3){
          e3.printStackTrace();
       }
       return;
    }
}

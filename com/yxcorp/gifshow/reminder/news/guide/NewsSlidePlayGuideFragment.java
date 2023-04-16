package com.yxcorp.gifshow.reminder.news.guide.NewsSlidePlayGuideFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.g2;
import com.yxcorp.gifshow.reminder.news.guide.b;
import androidx.fragment.app.Fragment;
import lnc.g2$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;

public class NewsSlidePlayGuideFragment extends BaseFragment	// class@001af6
{
    public g2 j;
    public static final int k;

    public void NewsSlidePlayGuideFragment(){
       super();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewsSlidePlayGuideFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.j = new g2(this, b.b);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NewsSlidePlayGuideFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d10a4, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewsSlidePlayGuideFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[]{this};
       this.j.b(objArray);
       return;
    }
}

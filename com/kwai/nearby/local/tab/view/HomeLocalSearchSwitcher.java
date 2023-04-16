package com.kwai.nearby.local.tab.view.HomeLocalSearchSwitcher;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import jd7.a;
import android.widget.ViewSwitcher$ViewFactory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.nearby.model.LocalSearchItem;
import lnc.a1;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import z1.a;

public class HomeLocalSearchSwitcher extends ViewSwitcher	// class@000ff9
{
    public b b;
    public List c;
    public int d;
    public boolean e;
    public a f;
    public static final int g;

    public void HomeLocalSearchSwitcher(Context p0){
       super(p0, null);
    }
    public void HomeLocalSearchSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = false;
       this.c = new ArrayList();
       this.d = 0;
       this.setFactory(new a(p0));
       if (PatchProxy.applyVoid(null, this, HomeLocalSearchSwitcher.class, "1")) {
       }else if(this.c.isEmpty()){
          LocalSearchItem localSearchI = new LocalSearchItem();
          localSearchI.mKeyword = a1.p(0x7f10454a);
          this.c.add(localSearchI);
       }
       this.getNextView().findViewById(R.id.search_tv).setText(this.c.get(this.d).mKeyword);
       this.showNext();
       return;
    }
    public String getCurrentWord(){
       Object obj = PatchProxy.apply(null, this, HomeLocalSearchSwitcher.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getCurrentView().findViewById(0x7f0a37d8).getText().toString();
    }
    public void setOnNextWordConsumer(a p0){
       this.f = p0;
    }
}

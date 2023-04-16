package com.tencent.mm.opensdk.diffdev.a.a$a$a;
import java.lang.Runnable;
import com.tencent.mm.opensdk.diffdev.a.a$a;
import java.lang.Object;
import java.util.ArrayList;
import com.tencent.mm.opensdk.diffdev.a.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import com.tencent.mm.opensdk.diffdev.OAuthListener;

public class a$a$a implements Runnable	// class@000e7c
{
    public final a$a a;

    public void a$a$a(a$a p0){
       this.a = p0;
       super();
    }
    public void run(){
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(a.a(this.a.a));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          iterator.next().onQrcodeScanned();
       }
       return;
    }
}

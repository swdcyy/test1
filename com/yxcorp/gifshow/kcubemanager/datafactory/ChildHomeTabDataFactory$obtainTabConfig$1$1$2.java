package com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1$1;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabConfig;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$obtainTabConfig$1;
import java.util.Objects;
import vxa.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import vxa.c;
import java.lang.reflect.Type;
import el.a;
import tra.a;
import android.content.SharedPreferences;
import km8.b;
import java.util.Collection;
import ekd.q;
import com.google.gson.Gson;
import vxa.b;
import java.util.Iterator;
import com.kwai.framework.model.channel.HotChannel;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createTeeRecoSubConfigs$2;
import com.yxcorp.gifshow.kcubemanager.datafactory.ChildHomeTabDataFactory$createTeeRecoSubConfigs$3;

public final class ChildHomeTabDataFactory$obtainTabConfig$1$1$2 extends Lambda implements l	// class@0019ed
{
    public final ChildHomeTabDataFactory$obtainTabConfig$1$1 this$0;

    public void ChildHomeTabDataFactory$obtainTabConfig$1$1$2(ChildHomeTabDataFactory$obtainTabConfig$1$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TabConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildHomeTabDataFactory$obtainTabConfig$1$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.mId = "teenReco";
       p0.mType = "con_teenReco";
       ChildHomeTabDataFactory$obtainTabConfig$1 this$0 = this.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       Object[] objArray = null;
       ArrayList uArrayList = PatchProxy.apply(objArray, this$0, a.class, "4");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          Type type = new c().getType();
          String str = "";
          String str1 = a.a.getString("teenageChannelList", str);
          if (str1 != null && str1 != str) {
             objArray = b.a(str1, type);
          }
          if (q.f(objArray)) {
             objArray = new Gson().i("[{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"���x\",\"nameSc\":\"��ѡ\",\"nameEn\":\"Preferred\",\"name\":\"��ѡ\",\"id\":0},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"����\",\"nameSc\":\"����\",\"nameEn\":\"Animal\",\"name\":\"����\",\"id\":1},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"�w��\",\"nameSc\":\"����\",\"nameEn\":\"Sports\",\"name\":\"����\",\"id\":2},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"��ˇ\",\"nameSc\":\"����\",\"nameEn\":\"Talent\",\"name\":\"����\",\"id\":3},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"����\",\"nameSc\":\"����\",\"nameEn\":\"Music\",\"name\":\"����\",\"id\":4},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"���[\",\"nameSc\":\"����\",\"nameEn\":\"Travel\",\"name\":\"����\",\"id\":5},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"�Z�ԌW��\",\"nameSc\":\"����ѧϰ\",\"nameEn\":\"Language learning\",\"name\":\"����ѧϰ\",\"id\":6},{\"h5Url\":null,\"tabType\":1,\"nameTc\":\"����\",\"nameSc\":\"����\",\"nameEn\":\"Education\",\"name\":\"����\",\"id\":7}]", new b().getType());
          }
          if (!q.f(objArray)) {
             a.m(objArray);
             Iterator iterator = objArray.iterator();
             while (iterator.hasNext()) {
                HotChannel hotChannel = iterator.next();
                hotChannel.mTeenageMode = true;
                uArrayList.add(this$0.d(new ChildHomeTabDataFactory$createTeeRecoSubConfigs$2(hotChannel)));
             }
          }else {
             HotChannel hotChannel1 = new HotChannel("0", "��ѡ", true);
             hotChannel1.mNameSc = "��ѡ";
             hotChannel1.mNameTc = "���x";
             hotChannel1.mNameEn = "Preferred";
             hotChannel1.mTeenageMode = true;
             uArrayList.add(this$0.d(new ChildHomeTabDataFactory$createTeeRecoSubConfigs$3(hotChannel1)));
          }
       }
       p0.mSubTabList = uArrayList;
       return;
    }
}

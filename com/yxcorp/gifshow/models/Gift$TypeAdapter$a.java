package com.yxcorp.gifshow.models.Gift$TypeAdapter$a;
import bl.p;
import com.yxcorp.gifshow.models.Gift$TypeAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.collection.ArrayMap;

public class Gift$TypeAdapter$a implements p	// class@001fb9
{
    public final Gift$TypeAdapter a;

    public void Gift$TypeAdapter$a(Gift$TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object a(){
       ArrayMap uArrayMap = PatchProxy.apply(null, this, Gift$TypeAdapter$a.class, "1");
       if (uArrayMap != PatchProxyResult.class) {
       }else {
          uArrayMap = new ArrayMap();
       }
       return uArrayMap;
    }
}

package com.yxcorp.gifshow.notice.box.detail.data.model.a;
import ok.h;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import ekd.k0;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemType;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;

public final class a implements h	// class@001260
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       return NoticeBoxItemType.fromContentType(k0.f(p0, "cardType", 0)).createItem();
    }
}

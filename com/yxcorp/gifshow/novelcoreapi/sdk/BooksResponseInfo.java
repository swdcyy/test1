package com.yxcorp.gifshow.novelcoreapi.sdk.BooksResponseInfo;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public class BooksResponseInfo implements CursorResponse, Serializable	// class@0021bb
{
    public int bookCount;
    public List books;
    public String nextCursor;

    public void BooksResponseInfo(){
       super();
       this.books = new ArrayList();
       this.nextCursor = "";
    }
    public final int getBookCount(){
       return this.bookCount;
    }
    public final Integer getBookCount(){
       Object obj = PatchProxy.apply(null, this, BooksResponseInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(this.bookCount);
    }
    public final List getBooks(){
       return this.books;
    }
    public String getCursor(){
       return this.nextCursor;
    }
    public List getItems(){
       return this.books;
    }
    public final String getNextCursor(){
       return this.nextCursor;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, BooksResponseInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.g(this.nextCursor, "no_more") ^ 0x01);
    }
    public final void setBookCount(int p0){
       this.bookCount = p0;
    }
    public final void setBooks(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BooksResponseInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.books = p0;
       return;
    }
    public final void setNextCursor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BooksResponseInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.nextCursor = p0;
       return;
    }
}

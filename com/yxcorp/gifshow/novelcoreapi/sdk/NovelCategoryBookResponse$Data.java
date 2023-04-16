package com.yxcorp.gifshow.novelcoreapi.sdk.NovelCategoryBookResponse$Data;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NovelCategoryBookResponse$Data implements Serializable	// class@0021c2
{
    public List books;
    public String nextCursor;

    public void NovelCategoryBookResponse$Data(){
       super();
       this.books = new ArrayList();
       this.nextCursor = "";
    }
    public final List getBooks(){
       return this.books;
    }
    public final String getNextCursor(){
       return this.nextCursor;
    }
    public final void setBooks(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NovelCategoryBookResponse$Data.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.books = p0;
       return;
    }
    public final void setNextCursor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NovelCategoryBookResponse$Data.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.nextCursor = p0;
       return;
    }
}

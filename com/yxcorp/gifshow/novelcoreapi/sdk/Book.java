package com.yxcorp.gifshow.novelcoreapi.sdk.Book;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class Book	// class@0021b9
{
    public int a;
    public String authorName;
    public String b;
    public String backGroupColor;
    public String c;
    public String categoryId;
    public String categoryName;
    public int categoryType;
    public String charColor;
    public String coverUrl;
    public Long d;
    public String desc;
    public String detailUrl;
    public boolean e;
    public Long f;
    public String id;
    public boolean inBookshelf;
    public int itemType;
    public long lastReadChapterId;
    public String lastReadChapterName;
    public double lastReadChapterPercent;
    public long lastReadTime;
    public long lastUpdateChapterId;
    public String lastUpdateChapterName;
    public long lastUpdateTime;
    public String llsid;
    public String moduleId;
    public String name;
    public int rank;
    public int serialStatus;
    public boolean showDot;
    public int status;
    public String subCategoryId;
    public String subCategoryName;
    public List tags;
    public long totalChapterNum;
    public long totalClick;
    public long totalWords;
    public long unreadChapterCnt;

    public void Book(){
       super();
       this.d = Long.valueOf(-1);
       this.e = false;
       this.f = Long.valueOf(0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Book.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof Book) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.id, p0.id);
    }
}

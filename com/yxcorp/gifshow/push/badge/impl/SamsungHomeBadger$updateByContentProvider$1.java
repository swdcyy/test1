package com.yxcorp.gifshow.push.badge.impl.SamsungHomeBadger$updateByContentProvider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.badge.impl.c;
import android.content.Context;
import android.content.ComponentName;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import kotlin.jvm.internal.a;
import android.content.ContentValues;
import com.yxcorp.gifshow.push.badge.ShortcutBadgeException;
import java.lang.Exception;

public final class SamsungHomeBadger$updateByContentProvider$1 extends Lambda implements a	// class@001634
{
    public final int $badgeCount;
    public final ComponentName $componentName;
    public final Context $context;
    public final c this$0;

    public void SamsungHomeBadger$updateByContentProvider$1(c p0,Context p1,ComponentName p2,int p3){
       this.this$0 = p0;
       this.$context = p1;
       this.$componentName = p2;
       this.$badgeCount = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
       ContentResolver contentResol = this.$context.getContentResolver();
       try{
          int i = 0;
          String[] stringArray = new String[]{this.$componentName.getPackageName()};
          Cursor uCursor = contentResol.query(uri, c.f, "package=?", stringArray, null);
          if (uCursor != null) {
             String className = this.$componentName.getClassName();
             a.o(className, "componentName.className");
             SamsungHomeBadger$updateByContentProvider$1 oupdateByCon = null;
             while (uCursor.moveToNext()) {
                String[] stringArray1 = new String[]{String.valueOf(uCursor.getInt(0))};
                contentResol.update(uri, this.this$0.e(this.$componentName, this.$badgeCount, 0), "_id=?", stringArray1);
                if (a.g(className, uCursor.getString(uCursor.getColumnIndex("class")))) {
                   oupdateByCon = 1;
                }
             }
             if (!oupdateByCon) {
                contentResol.insert(uri, this.this$0.e(this.$componentName, this.$badgeCount, 1));
             }
          }
          if (uCursor != null && !uCursor.isClosed()) {
             uCursor.close();
          }
          return;
       }catch(java.lang.Exception e0){
          throw new ShortcutBadgeException("Unable to execute Badge By Content Provider", e0);
       }
    }
}

package com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import skd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zf6.j;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import skd.a$a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class StoryTextDataManager	// class@000adc
{
    public final StoryTextDataManager$TextColors[] a;
    public final a b;
    public static final StoryTextDataManager$TextColors c;

    static {
       StoryTextDataManager$TextColors textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f060725), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f060624), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f060788));
       StoryTextDataManager.c = v7;
    }
    public void StoryTextDataManager(){
       int i = this;
       super();
       StoryTextDataManager$TextColors[] textColorsAr = new StoryTextDataManager$TextColors[13];
       textColorsAr[0] = StoryTextDataManager.c;
       StoryTextDataManager$TextColors textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f060725), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f060725), StoryTextDataManager.b(0x7f060759), StoryTextDataManager.b(0x7f060725), StoryTextDataManager.b(0x7f060725));
       textColorsAr[1] = v2;
       StoryTextDataManager$TextColors textColors1 = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f0604d9), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f0604d9), StoryTextDataManager.b(0x7f061b42), StoryTextDataManager.b(0x7f0604d9), StoryTextDataManager.b(0x7f0604d9));
       textColorsAr[2] = v2;
       textColors1 = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f060764), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f060751), StoryTextDataManager.b(0x7f061b5b), StoryTextDataManager.b(0x7f060764), StoryTextDataManager.b(0x7f060764));
       textColorsAr[3] = v2;
       textColors1 = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f060657), StoryTextDataManager.b(0x7f060725), StoryTextDataManager.b(0x7f06066e), StoryTextDataManager.b(0x7f061bc9), StoryTextDataManager.b(0x7f060657), StoryTextDataManager.b(0x7f060658));
       textColorsAr[4] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f0603cc), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f061a3b), StoryTextDataManager.b(0x7f061a3c), StoryTextDataManager.b(0x7f0603cc), StoryTextDataManager.b(0x7f060740));
       textColorsAr[5] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f060726), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f060726), StoryTextDataManager.b(0x7f061a21), StoryTextDataManager.b(0x7f060726), StoryTextDataManager.b(0x7f06072c));
       textColorsAr[6] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f0605df), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f0605df), StoryTextDataManager.b(0x7f061a3f), StoryTextDataManager.b(0x7f0605df), StoryTextDataManager.b(0x7f0605e0));
       textColorsAr[7] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f060481), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f061a72), StoryTextDataManager.b(0x7f061a73), StoryTextDataManager.b(0x7f060481), StoryTextDataManager.b(0x7f060482));
       textColorsAr[8] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f061a51), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f061a51), StoryTextDataManager.b(0x7f061a52), StoryTextDataManager.b(0x7f061a51), StoryTextDataManager.b(0x7f061b72));
       textColorsAr[9] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f061a6b), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f061a6b), StoryTextDataManager.b(0x7f061a76), StoryTextDataManager.b(0x7f061a6b), StoryTextDataManager.b(0x7f061b8f));
       textColorsAr[10] = v2;
       textColors = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f0619e0), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f0619e0), StoryTextDataManager.b(0x7f0619e1), StoryTextDataManager.b(0x7f0619e0), StoryTextDataManager.b(0x7f061a5b));
       textColorsAr[11] = v2;
       textColors1 = new StoryTextDataManager$TextColors(StoryTextDataManager.b(0x7f061a5b), StoryTextDataManager.b(0x7f060788), StoryTextDataManager.b(0x7f061a5b), StoryTextDataManager.b(0x7f061a5c), StoryTextDataManager.b(0x7f061a5b), StoryTextDataManager.b(0x7f061a5a));
       textColorsAr[12] = v2;
       i.a = textColorsAr;
       i.b = a.b(a.a().a(), "STORY_EDIT_TEXT_DEFAULT_DATA_PREFERENCES");
    }
    public static int b(int p0){
       StoryTextDataManager storyTextDat = StoryTextDataManager.class;
       if (PatchProxy.isSupport(storyTextDat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, storyTextDat, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return j.a(p0, 1);
    }
    public StoryTextDrawer a(int p0,int p1){
       StoryTextDataManager storyTextDat = StoryTextDataManager.class;
       if (PatchProxy.isSupport(storyTextDat)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, storyTextDat, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       storyTextDat = this.a;
       if (storyTextDat.length <= p1) {
          return StoryTextDrawer.generateTextDrawer(storyTextDat[0], p0);
       }else {
          return StoryTextDrawer.generateTextDrawer(storyTextDat[p1], p0);
       }
    }
    public int c(int p0){
       StoryTextDataManager storyTextDat = StoryTextDataManager.class;
       if (PatchProxy.isSupport(storyTextDat)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, storyTextDat, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (p0 + 1) % 3;
       Object[] objArray = new Object[0];
       a.D().w("StoryTextDataManager", "getNextBackgroundColorData nowTextBackgroundStyle:"+p0, objArray);
       a$a uoa = this.b.a();
       uoa.putInt("BACKGROUND_STYLE", i);
       g.a(uoa);
       return i;
    }
}

package androidx.emoji.text.EmojiMetadata;
import java.lang.ThreadLocal;
import androidx.emoji.text.MetadataRepo;
import java.lang.Object;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import d3.b;
import d3.c;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;

public class EmojiMetadata	// class@000751
{
    public int mHasGlyph;
    public final int mIndex;
    public final MetadataRepo mMetadataRepo;
    public static final ThreadLocal sMetadataItem;

    static {
       EmojiMetadata.sMetadataItem = new ThreadLocal();
    }
    public void EmojiMetadata(MetadataRepo p0,int p1){
       super();
       this.mHasGlyph = 0;
       this.mMetadataRepo = p0;
       this.mIndex = p1;
    }
    public void draw(Canvas p0,float p1,float p2,Paint p3){
       p3.setTypeface(this.mMetadataRepo.getTypeface());
       p0.drawText(this.mMetadataRepo.getEmojiCharArray(), (this.mIndex * 2), 2, p1, p2, p3);
       p3.setTypeface(p3.getTypeface());
    }
    public int getCodepointAt(int p0){
       return this.getMetadataItem().h(p0);
    }
    public int getCodepointsLength(){
       return this.getMetadataItem().i();
    }
    public short getCompatAdded(){
       return this.getMetadataItem().j();
    }
    public int getHasGlyph(){
       return this.mHasGlyph;
    }
    public short getHeight(){
       return this.getMetadataItem().l();
    }
    public int getId(){
       return this.getMetadataItem().m();
    }
    public final b getMetadataItem(){
       ThreadLocal sMetadataIte = EmojiMetadata.sMetadataItem;
       b uob = sMetadataIte.get();
       if (uob == null) {
          uob = new b();
          sMetadataIte.set(uob);
       }
       this.mMetadataRepo.getMetadataList().j(uob, this.mIndex);
       return uob;
    }
    public short getSdkAdded(){
       return this.getMetadataItem().n();
    }
    public Typeface getTypeface(){
       return this.mMetadataRepo.getTypeface();
    }
    public short getWidth(){
       return this.getMetadataItem().o();
    }
    public boolean isDefaultEmoji(){
       return this.getMetadataItem().k();
    }
    public void setHasGlyph(boolean p0){
       int i = (p0)? 2: 1;
       this.mHasGlyph = i;
       return;
    }
    public String toString(){
       StringBuilder str = super.toString()+", id:"+Integer.toHexString(this.getId())+", codepoints:";
       int codepointsLe = this.getCodepointsLength();
       for (int i = 0; i < codepointsLe; i = i + 1) {
          str = str+Integer.toHexString(this.getCodepointAt(i))+" ";
       }
       return str;
    }
}

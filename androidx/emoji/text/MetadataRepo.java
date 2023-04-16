package androidx.emoji.text.MetadataRepo;
import java.lang.Object;
import androidx.emoji.text.MetadataRepo$Node;
import android.graphics.Typeface;
import d3.c;
import android.content.res.AssetManager;
import java.lang.String;
import androidx.emoji.text.MetadataListReader;
import java.io.InputStream;
import java.nio.ByteBuffer;
import androidx.emoji.text.EmojiMetadata;
import java.lang.Character;
import z1.h;

public final class MetadataRepo	// class@000765
{
    public final char[] mEmojiCharArray;
    public final c mMetadataList;
    public final MetadataRepo$Node mRootNode;
    public final Typeface mTypeface;

    public void MetadataRepo(){
       super();
       this.mTypeface = null;
       this.mMetadataList = null;
       this.mRootNode = new MetadataRepo$Node(1024);
       char[] uocharArray = new char[0];
       this.mEmojiCharArray = uocharArray;
    }
    public void MetadataRepo(Typeface p0,c p1){
       super();
       this.mTypeface = p0;
       this.mMetadataList = p1;
       this.mRootNode = new MetadataRepo$Node(1024);
       char[] uocharArray = new char[(p1.k() * 2)];
       this.mEmojiCharArray = uocharArray;
       this.constructIndex(p1);
    }
    public static MetadataRepo create(AssetManager p0,String p1){
       return new MetadataRepo(Typeface.createFromAsset(p0, p1), MetadataListReader.read(p0, p1));
    }
    public static MetadataRepo create(Typeface p0,InputStream p1){
       return new MetadataRepo(p0, MetadataListReader.read(p1));
    }
    public static MetadataRepo create(Typeface p0,ByteBuffer p1){
       return new MetadataRepo(p0, MetadataListReader.read(p1));
    }
    public final void constructIndex(c p0){
       int i = p0.k();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          EmojiMetadata uEmojiMetada = new EmojiMetadata(this, i1);
          int i2 = i1 * 2;
          Character.toChars(uEmojiMetada.getId(), this.mEmojiCharArray, i2);
          this.put(uEmojiMetada);
       }
       return;
    }
    public char[] getEmojiCharArray(){
       return this.mEmojiCharArray;
    }
    public c getMetadataList(){
       return this.mMetadataList;
    }
    public int getMetadataVersion(){
       return this.mMetadataList.m();
    }
    public MetadataRepo$Node getRootNode(){
       return this.mRootNode;
    }
    public Typeface getTypeface(){
       return this.mTypeface;
    }
    public void put(EmojiMetadata p0){
       h.h(p0, "emoji metadata cannot be null");
       boolean b = (p0.getCodepointsLength() > 0)? true: false;
       h.b(b, "invalid metadata codepoint length");
       this.mRootNode.put(p0, 0, (p0.getCodepointsLength() - 1));
       return;
    }
}

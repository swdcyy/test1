package androidx.emoji.text.MetadataListReader$OpenTypeReader;

public interface abstract MetadataListReader$OpenTypeReader	// class@000762
{

    long getPosition();
    int readTag();
    long readUnsignedInt();
    int readUnsignedShort();
    void skip(int p0);
}

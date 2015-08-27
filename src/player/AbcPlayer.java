package player;

import player.ast.*;
import sound.SequencePlayer;

public class AbcPlayer implements AbcVisitor<Void>
{
    /**
     * SequencePlayer plays pitches and rest
     */
    private final SequencePlayer sequencePlayer;

    /**
     * @param sequencePlayer
     */
    public AbcPlayer(SequencePlayer sequencePlayer)
    {
        this.sequencePlayer = sequencePlayer;
    }

    @Override
    public Void on(AbcTune tune)
    {
        tune.getHeader().accept(this);
        tune.getBody().accept(this);

        return null;
    }

    @Override
    public Void on(AbcHeader header)
    {
        return null;
    }

    @Override
    public Void on(AbcMusic body)
    {
        return null;
    }

    @Override
    public Void on(FieldNumber field)
    {
        return null;
    }

    @Override
    public Void on(FieldTitle field)
    {
        return null;
    }

    @Override
    public Void on(FieldKey field)
    {
        return null;
    }

    @Override
    public Void on(FieldVoice field)
    {
        return null;
    }

    @Override
    public Void on(Comment c)
    {
        return null;
    }

    @Override
    public Void on(ElementLine line)
    {
        return null;
    }

    @Override
    public Void on(Element element)
    {
        return null;
    }

    @Override
    public Void on(NthRepeat repeat)
    {
        return null;
    }

    @Override
    public Void on(Barline bar)
    {
        return null;
    }

    @Override
    public Void on(TupletElement element)
    {
        return null;
    }

    @Override
    public Void on(Note note)
    {
        return null;
    }

    @Override
    public Void on(MultiNote note)
    {
        return null;
    }

    @Override
    public Void on(NoteLength noteLength)
    {
        return null;
    }

    @Override
    public Void on(Rest rest)
    {
        return null;
    }

    @Override
    public Void on(Pitch pitch)
    {
        return null;
    }

    @Override
    public Void on(Basenote basenote)
    {
        return null;
    }


    @Override
    public String toString()
    {
        return sequencePlayer.toString();
    }
}
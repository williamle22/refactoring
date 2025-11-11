package theater;

/**
 * Describes a play, including its display name and type (e.g., tragedy, comedy).
 */
public class Play {

    private final String name;
    private final String type;

    public Play(final String name, final String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
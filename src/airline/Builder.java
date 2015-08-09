package airline;

/**
 * Creation Builder
 */
abstract class Builder {

    public abstract Plane getPlane(String name, int... args);
}
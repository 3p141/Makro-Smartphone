package kickstart.controller;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMakroEntry is a Querydsl query type for MakroEntry
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMakroEntry extends EntityPathBase<MakroEntry> {

    private static final long serialVersionUID = -1419288034L;

    public static final QMakroEntry makroEntry = new QMakroEntry("makroEntry");

    public final ListPath<String, StringPath> commands = this.<String, StringPath>createList("commands", String.class, StringPath.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QMakroEntry(String variable) {
        super(MakroEntry.class, forVariable(variable));
    }

    public QMakroEntry(Path<? extends MakroEntry> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMakroEntry(PathMetadata metadata) {
        super(MakroEntry.class, metadata);
    }

}


import org.openscience.cdk.interfaces.*;
import org.openscience.cdk.*;
import org.openscience.cdk.inchi.*;

methane = new AtomContainer();
atom1 = new Atom("C")
methane.addAtom(atom1)

factory = InChIGeneratorFactory.getInstance();
generator = factory.getInChIGenerator(methane);
print generator.getLog()

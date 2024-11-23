### Definition

- A list of items, called `nodes`, in which the order of the nodes is determined by the `address`, called the `link`, stored in each node.

Every node in a linked list have two parts:
- `data` - store relevant information
- `address@link` - store the address of the next node in the sequence

### Characteristics

- `homogeneous` - node should be of the same structure
- `unlimited size` - the node will be created upon addition, no predefined size
- `sequential access` - traversing the linked list starting from first/head node.

### Properties

- Address of first node in list stored in separate location, called the head or first
- Data type of each node depends on the specific application —kind of data being processed
- Link component of each node is a reference variable
- Data type of this reference variable is node type itself

# Maze Solver

## Overview

This Java program provides a simple maze solver using depth-first search. The maze is represented as a 2D array, and the solver navigates through the maze to find the path from the start to the destination.

## How It Works

The `DepthFirst` class contains the main logic for depth-first search. It recursively explores the maze, marking visited cells and backtracking when necessary. The solution path is stored in the List.

## Getting Started

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/your-username/maze-solver.git
    cd maze-solver
    ```

2. **Run the Solver:**
    ```bash
    javac Main.java
    java Main
    ```

## Maze Representation

The maze is represented by a 2D array in the `Main` class. The values in the array have the following meanings:
- `1`: Wall
- `0`: Open path
- `9`: Destination

```java
private int maze[][] = {
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    // ... (other rows)
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
};
```

## Visualization
The solution path is visualized by marking visited cells with green squares and the destination with a red square.

## Contributing
Feel free to contribute to this project by reporting issues, suggesting improvements, or submitting pull requests.

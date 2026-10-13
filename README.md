# Clojure Lab

A study project for learning Clojure with friends. Here we explore language concepts, build a simple HTTP API, and dig into the main libraries of the ecosystem.

## Getting Started

Prerequisites: [Clojure CLI](https://clojure.org/guides/install_clojure) installed.

```bash
# From the project root
clj -M -e "(require 'main) (main/start)"
```

The server starts at `http://localhost:8890`. Test it with:

```bash
curl http://localhost:8890/
```

Expected response:

```json
{"message": "Hello, World!"}
```

## Tech Stack

[![My Skills](https://skillicons.dev/icons?i=clojure)](https://skillicons.dev)


- **HTTP Framework:** [Pedestal](https://pedestal.io/pedestal/0.6/index.html) ([repo](https://github.com/pedestal/pedestal))
- **State/Lifecycle management:** [Stuart Sierra Component](https://github.com/stuartsierra/component)
- **Configuration:** [Aero](https://github.com/juxt/aero) (EDN)
- **Data access:** [HoneySQL](https://github.com/seancorfield/honeysql) (SQL as data, similar to an ORM)

## Finding Libraries

- [Clojars](https://clojars.org) — the official Clojure package repository

## Project Structure

```
.
├── deps.edn      # project dependencies and paths
└── src/
    └── main.clj  # API entry point
```

## Contributing

This is a collaborative study project. Feel free to open PRs with new examples, refactors, or experiments with new libraries.

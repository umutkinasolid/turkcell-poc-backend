#!/bin/bash
./build.sh
rsync --rsync-path="sudo rsync" -r -avh target/mycell.jar ubuntu@34.245.145.145:/opt/mycell/mycell.jar --delete
./run_remote.sh
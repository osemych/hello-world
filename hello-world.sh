#!/bin/sh env

echo "Job complete on node: $(hostname -f) ($(hostname -I | awk '{print $2}'))"
